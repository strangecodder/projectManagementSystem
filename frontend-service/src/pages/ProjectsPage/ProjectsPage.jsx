import { useState } from "react"
import ProjectsCard from "../../components/ProjectsCard/ProjectsCard.jsx"
import Button from "../../components/Button/Button.jsx"
import Modal from "../../components/Modal/Modal.jsx"
import addIcon from "../../assets/icons/carbon_add-alt.svg"
import './ProjectsPage.css'

function ProjectsPage() {
    const [modalActive, setModalActive] = useState(false)
    let clickAction = () => setModalActive(true)

    return (
        <>
        <aside className='main-aside'>

        </aside>
        <section className='main-section'>
            <div className="projects-page">
                <div className="projects-header">
                    <div>Проекты</div>
                    <Button style='button-component add-project-button' icon={addIcon} action={clickAction}/>
                </div>
                <div className="projects-list">
                    <ProjectsCard title='Проект 1' style='card widget-hide' buttonTitle='Перейти к проекту' linkTo='/projects/project-id/sprints' description='Описание проекта'/>
                </div>
            </div>
            <Modal active={modalActive} setActive={setModalActive} children={<p>А может негр мне тут реп не читать</p>} />
        </section>
        </>
    )
}

export default ProjectsPage