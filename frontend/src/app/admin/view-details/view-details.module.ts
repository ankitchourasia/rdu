import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ViewDetailsComponent } from './view-details.component';
import {ViewDetailsService} from './view-details.service';
import{FormsModule} from '@angular/forms';

@NgModule({
  imports: [
    CommonModule,
    FormsModule
  ],
  declarations: [ViewDetailsComponent],
  providers : [ViewDetailsService]
})
export class ViewDetailsModule { }
