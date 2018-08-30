import {Routes} from '@angular/router'
import {LogoComponent} from '../logo/logo.component'
import {InfoComponent} from '../info/info.component'
import {ContatoComponent} from '../contatos/contatos.component'
import {ErroComponent} from '../erro/erro.component'

export const appRoutes: Routes = [
    {path:'', component: LogoComponent},
    {path:'info', component: InfoComponent},
    {path:'contato', component: ContatoComponent},
    {path: '**', component: ErroComponent}
];
