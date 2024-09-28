import { useState } from "react"
import ProjectsCard from "../../components/ProjectsCard/ProjectsCard.jsx"
import Button from "../../components/Button/Button.jsx"
import Modal from "../../components/Modal/Modal.jsx"
import Input from "../../components/Input/Input.jsx"
import addIcon from "../../assets/icons/carbon_add-alt.svg"
import './SprintsPage.css'

function SprintsPage() {
    const [modalActive, setModalActive] = useState(false)
    let clickAction = () => setModalActive(true)


    return (
        <>
        <aside className='main-aside'>
            
        </aside>
        <section className='main-section'>
            <div className="projects-page">
                <div className="projects-header">
                    <div>Спринты</div>
                    <Button style='button-component add-project-button' icon={addIcon} action={clickAction}/>
                </div>
                <div className="projects-list">
                    <ProjectsCard title='Спринт 1' style='card button-hide' buttonTitle='Перейти к спринту' linkTo='/projects/project-id/sprints/sprint-id/tasks' endDateTime='01.01.2025'/>
                    <ProjectsCard title='Спринт 2' style='card button-hide' buttonTitle='Перейти к спринту' linkTo='/projects/project-id/sprints/sprint-id/tasks' endDateTime='01.01.2025'/>
                    <ProjectsCard title='Спринт 3' style='card button-hide' buttonTitle='Перейти к спринту' linkTo='/projects/project-id/sprints/sprint-id/tasks' endDateTime='01.01.2025'/>
                </div>
            </div>
            <Modal active={modalActive} setActive={setModalActive} children={<Input lbTitle='Название спринта' lbDesc='Описание спринта' subTitle='Создать спринт'/>} />
        </section>
        </>
    )
    
}

export default SprintsPage