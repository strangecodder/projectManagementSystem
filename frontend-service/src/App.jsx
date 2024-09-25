import { useState } from 'react'
import Button from './components/Button/Button.jsx'
import Logo from './components/Logo/Logo.jsx'
// import DashboardPage from './pages/DashoardPage/DashboardPage.jsx'
import ProjectsPage from './pages/ProjectsPage/ProjectsPage.jsx'
import './App.css'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
    <div className='main-header'>
      <Logo />
      <div className='main-nav'>
        <Button style='button-component' title='Календарь'/>
        <Button style='button-component active' title='Проекты'/>
        <Button style='button-component' title='Кабинет'/>
      </div>
      <Button style='button-component logout-button' title='Выход'/>
    </div>
    <div className='main-body'>
      <aside className='main-aside'>

      </aside>
      <section className='main-section'>
        <ProjectsPage />
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
