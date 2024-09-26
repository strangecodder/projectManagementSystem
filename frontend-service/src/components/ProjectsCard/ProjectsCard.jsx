import Button from "../Button/Button.jsx"
import LinkButton from "../LinkButton/LinkButton.jsx"
import DateTimeWidget from "../DateTimeWidget/DateTimeWidget.jsx"
import './ProjectsCard.css'


function ProjectsCard(props) {

    const { title, buttonTitle } = props

    return (
        <>
        <div className="card">
            <div className="card-header">
                <div className="card-title">{title}</div>
            </div>
            <div className="card-content">
                <LinkButton style='button-component to-project-button' link='/projects/project-1' title={buttonTitle}/>
            </div>
            <div className="card-footer">
                <Button style='button-component desc-button' />
                <DateTimeWidget />
            </div>
        </div>
        
        </>
    )
    
}

export default ProjectsCard