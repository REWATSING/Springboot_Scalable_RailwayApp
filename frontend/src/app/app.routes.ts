import { Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { BookingComponent } from './pages/booking/booking.component';
import { RegisterComponent } from './pages/register/register.component';
import { LoginComponent } from './pages/login/login.component';

export const routes: Routes = [  // ✅ Added `export`
  { path: '', component: HomeComponent },
  { path: 'booking', component: BookingComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'login', component: LoginComponent }
];
