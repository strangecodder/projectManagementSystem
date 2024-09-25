import Button from "../Button/Button.jsx"
import DateTimeWidget from "../DateTimeWidget/DateTimeWidget.jsx"
import './ProjectsCard.css'


function ProjectsCard() {

    return (
        <>
        <div className="projects-card">
            <div className="project-title">Проект 1</div>
            <Button style='button-component to-project-button' title='Перейти к проекту'/>
            <div className="card-footer">
                <DateTimeWidget />
            </div>
        </div>
        </>
    )
    
}

export default ProjectsCard