import {Component} from '@angular/core';

@Component({
    moduleId: module.id,
    selector: 'menu',
    templateUrl: 'views/menu.component.html'
})
export class MenuComponent{
    titulo: string = "Agenda Angular";
    titulo_info: string = "A Ferramenta";
    titulo_contato: string = "Contatos";
}