import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {RouterModule} from '@angular/router';
import {FormsModule} from '@angular/forms';//habilita o uso de ngModel

//componentes
import {appRoutes} from './route/app.route';
import { AppComponent }  from './app.component';
import {MenuComponent} from './menu/menu.component';
import {VerificarIdade} from './filters/verificaidade.filter';
import {Sublista} from './filters/sublista.filter'
import {HttpModule} from '@angular/http'

//componenetes usados nas rotas
import {LogoComponent} from './logo/logo.component';
import {ContatoComponent} from './contatos/contatos.component';
import {InfoComponent} from './info/info.component';
import {ErroComponent} from './erro/erro.component';

//services
import{ContatosService} from './services/contatos.service';

@NgModule({
  imports:      [ BrowserModule, RouterModule.forRoot(appRoutes), FormsModule, HttpModule ],

  declarations: [ AppComponent, MenuComponent,
    LogoComponent, ContatoComponent,
    InfoComponent, ErroComponent,
    VerificarIdade, Sublista ],

  providers:    [ContatosService],

  bootstrap:    [ AppComponent ]
})
export class AppModule { }
