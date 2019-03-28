import { Component, OnInit } from '@angular/core';
import { UsersService } from './users.service';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {

  list: any;

  constructor(private userService: UsersService) { }

  ngOnInit() {
    this.userService.getUsers().subscribe((users) => {
      console.log(users);
      this.list = users;
    })

  }

}
