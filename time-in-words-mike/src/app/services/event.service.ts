import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import {BehaviorSubject } from 'rxjs';
import { environment as env } from '../../environments/environment';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class EventService {

  constructor(private http: HttpClient, private router: Router) {

  }

  submit(event: string, location: string, time: string) {

    let newEvent = { event, location, time };
    
    return this.http.post(`${env.API_URL}/event`, event, {
      headers: {
        'Content-type': 'application/json'
      },
      observe: 'response' // default is body (which refers to the body of the response)
    }).pipe(

      
    ).toPromise()
  }


}
