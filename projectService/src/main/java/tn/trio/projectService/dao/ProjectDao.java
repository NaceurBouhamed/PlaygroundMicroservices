package tn.trio.projectService.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.trio.projectService.entities.Project;

public interface ProjectDao extends JpaRepository<Project, Long>  {

}
