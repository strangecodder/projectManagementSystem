import { useState } from 'react'
import { Routes, Route, Link } from "react-router-dom";
import Button from './components/Button/Button.jsx'
import Logo from './components/Logo/Logo.jsx'
import LinkButton from './components/LinkButton/LinkButton.jsx'
// import DashboardPage from './pages/DashoardPage/DashboardPage.jsx'
import ProjectsPage from './pages/ProjectsPage/ProjectsPage.jsx'
import DashboardPage from './pages/DashoardPage/DashboardPage.jsx';
import ProfilePage from './pages/ProfilePage/ProfilePage.jsx';
import AboutUsPage from './pages/AboutUsPage/AboutUsPage.jsx';
import './App.css'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
    <div className='main-header'>
      <Logo />
      <div className='main-nav'>
        <LinkButton style='button-component active' link='/dashboard' title='Календарь'/>
        <LinkButton style='button-component' link='/projects' title='Проекты'/>
      </div>
      <LinkButton style='button-component profile-button' link='/profile' title=''/>
    </div>
    <div className='main-body'>
      <aside className='main-aside'>

      </aside>
      <section className='main-section'>
        <Routes>
          <Route path='/dashboard' element={<DashboardPage />}/>
          <Route path='/projects' element={<ProjectsPage />}/>
          <Route path='/profile' element={<ProfilePage />}/>
          <Route path='/about-us' element={<AboutUsPage />}/>
        </Routes>
      </section>
    </div>







      {/* <div>
        <a href="https://vitejs.dev" target="_blank">
          <img src={viteLogo} className="logo" alt="Vite logo" />
        </a>
        <a href="https://react.dev" target="_blank">
          <img src={reactLogo} className="logo react" alt="React logo" />
        </a>
      </div>
      <h1>Vite + React</h1>
      <div className="card">
        <button onClick={() => setCount((count) => count + 1)}>
          count is {count}
        </button>
        <p>
          Edit <code>src/App.jsx</code> and save to test HMR
        </p>
      </div>
      <p className="read-the-docs">
        Click on the Vite and React logos to learn more
      </p> */}
    </>
  )
}

export default App
