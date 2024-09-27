import { useState } from "react"
import ProjectsCard from "../../components/ProjectsCard/ProjectsCard.jsx"
import Button from "../../components/Button/Button.jsx"
import LinkButton from "../../components/LinkButton/LinkButton.jsx"
import Modal from "../../components/Modal/Modal.jsx"
import addIcon from "../../assets/icons/carbon_add-alt.svg"
import './TasksPage.css'

function TasksPage() {
    const [modalActive, setModalActive] = useState(false)
    let clickAction = () => setModalActive(true)
    

    return (
        <>
        <aside className='main-aside'>
            <LinkButton style='linkbutton-component active' link='/projects/project-id/sprints/sprint-id/tasks' title='Задачи'/>
            <LinkButton style='linkbutton-component' link='/projects/project-id/sprints/sprint-id/tasks/kanban' title='Таблица задач'/>
            <LinkButton style='linkbutton-component' link='/projects/project-id/sprints/sprint-id/tasks/wiki' title='Вики'/>
        </aside>
        <section className='main-section'>
            <div className="projects-page">
                <div className="projects-header">
                    <div>Задачи</div>
                    <Button style='button-component add-project-button' icon={addIcon} action={clickAction}/>
                </div>
                <div className="projects-list">
                    <ProjectsCard title='Задача 1' style='card hide-content' description='Описание задачи' endDateTime='16:00'/>
                    <ProjectsCard title='Задача 2' style='card hide-content' description='Описание задачи' endDateTime='16:00'/>
                    <ProjectsCard title='Задача 3' style='card hide-content' description='Описание задачи' endDateTime='16:00'/>
                    <ProjectsCard title='Задача 4' style='card hide-content' description='Описание задачи' endDateTime='16:00'/>
                    <ProjectsCard title='Задача 5' style='card hide-content' description='Описание задачи' endDateTime='16:00'/>
                    <ProjectsCard title='Задача 6' style='card hide-content' description='Описание задачи' endDateTime='16:00'/>
                </div>
            </div>
            <Modal active={modalActive} setActive={setModalActive} children={<p></p>} />
        </section>
        </>
    )
    
}

export default TasksPage