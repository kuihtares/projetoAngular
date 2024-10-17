import { Component } from '@angular/core';
import {HttpErrorResponse} from '@angular/common/http';
import {AuthService} from '../auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
  standalone: true,
})
export class LoginComponent {
  username: string = '';
  password: string = '';

  constructor(private authService: AuthService) {}

  onSubmit() {
    this.authService.login(this.username, this.password).subscribe(
      (response : any) => {
        console.log('Login bem-sucedido', response);
        // Redirecionar ou armazenar token, etc.
      },
      (error: HttpErrorResponse) => {
        console.error('Erro no login', error);
      }
    );
  }
}
