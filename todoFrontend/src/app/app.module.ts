import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddTodoComponent } from './pages/add-todo/add-todo.component';
import { ViewTodoComponent } from './components/navbar/view-todo/view-todo.component';
import { HomeComponent } from './pages/home/home.component';
import { UpdateTodoComponent } from './pages/update-todo/update-todo.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { FooterComponent } from './components/footer/footer.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ViewTodosComponent } from './pages/view-todos/view-todos.component';
import {FormsModule} from "@angular/forms";

@NgModule({
  declarations: [
    AppComponent,
    AddTodoComponent,
    ViewTodoComponent,
    HomeComponent,
    UpdateTodoComponent,
    NavbarComponent,
    FooterComponent,
    ViewTodosComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
