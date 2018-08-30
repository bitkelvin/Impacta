import {Component} from '@angular/core';
import{IContatos} from '../interfaces/interface.contatos';
import {ContatosService} from '../services/contatos.service';

@Component({
    moduleId:module.id,
    templateUrl: 'views/contatos.component.html'
})
export class ContatoComponent{
    //para um produto selecionado
    public contatoSelecionado: IContatos;

    //para um novo produto
    private novoContato: IContatos;

    public selecionar(contato: IContatos): void{
        this.contatoSelecionado = contato;
    }

    //para a lista de produtos
    listaContatos: IContatos[];
    constructor(private contatosService: ContatosService){
        //this.listaContatos = contatosService.getContatos();
        this.listar();
    }

    public listar():void{
        this.contatosService.getContatosWS().subscribe(res => this.listaContatos = res, error => alert(error),() => console.log('finalizado')); 
    }

    //para a inclusão de um novo objeto IProduto
    public novo(){
        this.novoContato = {
            id: null,
            nome: '',
            telefone: 0,
            idade: 0,
            email: ''
        };
        this.contatoSelecionado = this.novoContato;
    }

    //simulando uma inclusão na lista
    public incluir(contato: IContatos){
        //this.listaContatos.push(contato);
        this.contatosService.setContatoWS(contato).subscribe(res => JSON.stringify(res), error => alert(error), () => this.listar());
        alert('Contato incluído');
    }
    
    //simulando uma remoção na lista
    public remover(contato: IContatos){
        //this.listaContatos.push(contato);
        this.contatosService.removerContatoWS(contato).subscribe(res => JSON.stringify(res), error => alert(error), () => this.listar());
        alert('Contato removido');
    }
}