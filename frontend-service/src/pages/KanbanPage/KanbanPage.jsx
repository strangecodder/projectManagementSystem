import { useState } from "react"
import ProjectsCard from "../../components/ProjectsCard/ProjectsCard.jsx"
import Button from "../../components/Button/Button.jsx"
import LinkButton from "../../components/LinkButton/LinkButton.jsx"
import Modal from "../../components/Modal/Modal.jsx"
import Input from "../../components/Input/Input.jsx"
import addIcon from "../../assets/icons/carbon_add-alt.svg"
import './KanbanPage.css'

function KanbanPage() {
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
            <div className="kanban">
                <div className="kanban-page">
                    <div className="kanban-header">
                        <div>Задачи</div>
                        <Button style='button-component add-project-button' icon={addIcon} action={clickAction}/>
                    </div>
                    <div className="kanban-list">
                        <ProjectsCard title='Задача 1' style='card hide-content is-draggable' description='Описание задачи' endDateTime='16:00' draggable={true}/>
                        <ProjectsCard title='Задача 2' style='card hide-content is-draggable' description='Описание задачи' endDateTime='16:00' draggable={true}/>
                    </div>
                </div>
                <Modal active={modalActive} setActive={setModalActive} children={<Input lbTitle='Название задачи' lbDesc='Описание задачи' subTitle='Создать задачу'/>} />
                <div className="kanban-page">
                    <div className="kanban-header">
                        <div>В работе</div>
                    </div>
                    <div className="kanban-list">
                        <ProjectsCard title='Задача 1' style='card hide-content is-draggable' description='Описание задачи' endDateTime='16:00' draggable={true}/>
                        <ProjectsCard title='Задача 2' style='card hide-content is-draggable' description='Описание задачи' endDateTime='16:00' draggable={true}/>
                    </div>
                </div>
                <div className="kanban-page">
                    <div className="kanban-header">
                        <div>На проверке</div>
                    </div>
                    <div className="kanban-list">
                        <ProjectsCard title='Задача 1' style='card hide-content is-draggable' description='Описание задачи' endDateTime='16:00' draggable={true}/>
                        <ProjectsCard title='Задача 2' style='card hide-content is-draggable' description='Описание задачи' endDateTime='16:00' draggable={true}/>
                    </div>
                </div>
                <div className="kanban-page">
                    <div className="kanban-header">
                        <div>Выполнено</div>
                    </div>
                    <div className="kanban-list">
                        <ProjectsCard title='Задача 1' style='card hide-content is-draggable' description='Описание задачи' endDateTime='16:00' draggable={true}/>
                        <ProjectsCard title='Задача 2' style='card hide-content is-draggable' description='Описание задачи' endDateTime='16:00' draggable={true}/>
                    </div>
                </div>
            </div>
        </section>
        </>
    )
    
}

export default KanbanPage