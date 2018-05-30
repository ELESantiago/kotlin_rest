import { NgModule } from '@angular/core';
import * as material from '@angular/material';

@NgModule({
    imports: [
        material.MatInputModule,
        material.MatFormFieldModule,
        material.MatButtonModule, 
        material.MatCheckboxModule,
    ],
    exports: [
        material.MatInputModule,
        material.MatFormFieldModule,
        material.MatButtonModule, 
        material.MatCheckboxModule,
    ],
})
export class MaterialModule { }
