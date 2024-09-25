import ProjectsCard from "../../components/ProjectsCard/ProjectsCard.jsx"
import Button from "../../components/Button/Button.jsx"
import './ProjectsPage.css'

function ProjectsPage() {

    return (
        <>
        <div className="projects-page">
            <div className="projects-header">
                <div>Проекты</div>
                <Button style='button-component add-project-button' title='+'/>
            </div>
            <div className="projects-list">
                <ProjectsCard />
                <ProjectsCard />
                <ProjectsCard />
                <ProjectsCard />
                <ProjectsCard />
                <ProjectsCard />
                <ProjectsCard />
            </div>
        </div>
        </>
    )
    
}

export default ProjectsPage