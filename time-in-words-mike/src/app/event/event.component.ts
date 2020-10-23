import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { EventService } from '../services/event.service';

@Component({
  selector: 'app-event',
  templateUrl: './event.component.html',
  styleUrls: ['./event.component.css']
})
export class EventComponent implements OnInit{

  newEventForm: FormGroup;

  constructor(private formBuilder: FormBuilder, private eventService: EventService, private router: Router) {

  }

  ngOnInit(): void {
    this.newEventForm = this.formBuilder.group({
      event: [null, Validators.required],
      location: [null, Validators.required],
      time: [null, Validators.required]
    })
  }

  get formFields() {
    return this.newEventForm.controls;
  }

   submit() {

    let event = this.formFields.event.value;
    let location = this.formFields.location.value;
    let time = this.formFields.time.value;

    this.eventService.submit(event, location, time)
  }

  

}
