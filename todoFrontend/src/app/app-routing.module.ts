import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {HomeComponent} from "./pages/home/home.component";
import {ViewTodoComponent} from "./components/navbar/view-todo/view-todo.component";
import {UpdateTodoComponent} from "./pages/update-todo/update-todo.component";
import {AddTodoComponent} from "./pages/add-todo/add-todo.component";
import {ViewTodosComponent} from "./pages/view-todos/view-todos.component";

const routes: Routes = [
  {
    path:'',
    redirectTo: 'home',
    pathMatch:"full"
  },

  {
    path:'home',
    component:HomeComponent,
    title:"Home"
  },
  {
    path:'view-todos',
    component:ViewTodosComponent,
    title:"View Todo list"
  },
  {
    path:'add-todo',
    component:AddTodoComponent,
    title:"Add-todo"
  },
  {
    path:'update-todo',
    component:UpdateTodoComponent,
    title:"Update"
  },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
