import {Pipe, PipeTransform} from '@angular/core';

@Pipe({
    name: 'verificarIdade'
})
export class VerificarIdade implements PipeTransform{
    transform(valor: number): string{
        if (valor < 17) {
            return "Menor de idade";
        }else if(valor > 65){
            return "Aposentado"
        }else{
            return "Maior de idade";
        }
    }
}