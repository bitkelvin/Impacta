import {Injectable} from '@angular/core';
import {IContatos} from '../interfaces/interface.contatos';

import {Http, Response, Headers, RequestOptions} from '@angular/http';
import {Observable} from 'rxjs/Rx'; //Reactive extensions for JS
import 'rxjs/Rx'; //importamos todas as ferramentas usadas pelo observable

@Injectable()
export class ContatosService{

    public constructor (private http: Http){};
    
    private url: string = "http://localhost:8080/07_GestaoProdutos/wsjsonagenda";
    private urlRemover: string = "http://localhost:8080/07_GestaoProdutos/wsjsonagenda/remover";
    private urlAlterar: string = "http://localhost:8080/07_GestaoProdutos/wsjsonagenda/alterar";

    //o metodo get() retorna um Observable que, quando detectar
    //que a requisição foi completada, vai delegar a resposta
    //atraves do parametro da função map().
    public getContatosWS(): Observable<IContatos[]>{
        return this.http.get(this.url).map(res => res.json());
    }

    public setContatoWS(contact: IContatos): Observable<IContatos[]>{
        let header = new Headers({'Content-Type':'application/json'});
        let options = new RequestOptions({headers: header});

        let json = JSON.stringify({
            id:null,
            nome:contact.nome,
            telefone: contact.telefone,
            idade: contact.idade,
            email: contact.email 
        });
        return this.http.post(this.url, json, options).map(res => res.json());
    }

    public removerContatoWS(contact: IContatos): Observable<IContatos[]>{
        let header = new Headers({'Content-Type':'application/json'});
        let options = new RequestOptions({headers: header});

        let json = JSON.stringify({
            id:contact.id,
            nome:contact.nome,
            telefone: contact.telefone,
            idade: contact.idade,
            email: contact.email 
        });
        return this.http.post(this.urlRemover, json, options).map(res => res.json());
    }

    //metodo antigo
    public getContatos() : IContatos[]{
        return [
            {id: 55, nome:'Danilo Mendes', telefone:964466280, idade:21, email:'danilokhpp@hotmail.com'},
            {id: 56, nome:'Bárbara Alves', telefone:55128321, idade:18, email:'barbaraalves022@gmail.com'}
        ];
    }
}