import {Pipe, PipeTransform} from '@angular/core';
import {IContatos} from '../interfaces/interface.contatos';

@Pipe({
    name: 'sublista'
})
export class Sublista implements PipeTransform{
    transform(contatos: IContatos[], input: string): IContatos[]{
        //usando aerofunction (expressao lambda)
        return contatos.filter(item => item.nome.toLowerCase().indexOf(input.toLowerCase()) === 0);
    }
}