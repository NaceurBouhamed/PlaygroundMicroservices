import { Component, OnInit } from '@angular/core';
import { ProjectsService } from './projects.service';

@Component({
  selector: 'app-projects',
  templateUrl: './projects.component.html',
  styleUrls: ['./projects.component.css']
})
export class ProjectsComponent implements OnInit {

  list:any;

  constructor(private projectService:ProjectsService) { }

  ngOnInit() {
    this.projectService.getProjects().subscribe((projects)=>{
      console.log(projects);
      this.list = projects;
    })
  }

}
