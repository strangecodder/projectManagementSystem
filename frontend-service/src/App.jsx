import { useState } from 'react'
import { Routes, Route, Link } from "react-router-dom"
import LinkButton from './components/LinkButton/LinkButton.jsx'
import ProjectsPage from './pages/ProjectsPage/ProjectsPage.jsx'
import DashboardPage from './pages/DashoardPage/DashboardPage.jsx'
import ProfilePage from './pages/ProfilePage/ProfilePage.jsx'
import AboutUsPage from './pages/AboutUsPage/AboutUsPage.jsx'
import SprintsPage from './pages/SprintsPage/SprintsPage.jsx'
import TasksPage from './pages/TasksPage/TasksPage.jsx'
import KanbanPage from './pages/KanbanPage/KanbanPage.jsx'
import teamLogo from './assets/img/logo.png'
import profileIcon from './assets/icons/carbon_user-profile.svg'
import './App.css'

function App() {

  return (
    <>
    <div className='main-header'>
      <LinkButton style='linkbutton-component profile-linkbutton white' link='/about-us' icon={teamLogo} iconSize='52px'/>
      <div className='main-nav'>
        <LinkButton style='linkbutton-component' link='/dashboard' title='Календарь'/>
        <LinkButton style='linkbutton-component active' link='/projects' title='Проекты'/>
      </div>
      <LinkButton style='linkbutton-component profile-linkbutton' link='/profile' icon={profileIcon} />
    </div>
    <div className='main-body'>
        <Routes>
          <Route path='/dashboard' element={<DashboardPage />}/>
          <Route path='/projects' element={<ProjectsPage />}/>
          <Route path='/profile' element={<ProfilePage />}/>
          <Route path='/about-us' element={<AboutUsPage />}/>
          <Route path='/projects/project-id/sprints' element={<SprintsPage />}/>
          <Route path='/projects/project-id/sprints/sprint-id/tasks' element={<TasksPage />}/>
          <Route path='/projects/project-id/sprints/sprint-id/tasks/kanban' element={<KanbanPage />}/>
        </Routes>
    </div>
    </>
  )
}

export default App
