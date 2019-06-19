import { Injectable } from '@angular/core';

declare var $ : any;

@Injectable({
  providedIn: 'root'
})
export class ModalService {

  private title: String;
  private content: any;
  private mode: String;

  constructor() { }

  close(){
    $("modal").modal('hide');
    this.clear();
  }

  info(content: any){
    this.mode='info';
    this.content=content;
  }

  warning(content: any){
    this.mode='warn';
    this.title='Warning!';
    this.content=content;
  }

  error(content: any){
    this.mode='error';
    this.title='Error';
    this.content=content;
  }

  success(content: any){
    this.mode='success';
    this.title='Success';
    this.content=content;
  }

  clear(){
    this.mode=null;
    this.title=null;
    this.content=null;
  }

  confirm(){
    this.mode='confirm';
  }
}
