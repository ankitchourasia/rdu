import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ConsumerComponent } from './consumer.component';
import {FormsModule} from '@angular/forms';
import {ConsumerService} from './consumer.service';

@NgModule({
  imports: [
    CommonModule,
    FormsModule
  ],
  declarations: [ConsumerComponent],
  providers : [ConsumerService]
})
export class ConsumerModule { }
