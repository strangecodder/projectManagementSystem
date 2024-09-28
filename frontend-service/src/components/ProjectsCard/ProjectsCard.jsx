import { useState } from "react"
import Button from "../Button/Button.jsx"
import LinkButton from "../LinkButton/LinkButton.jsx"
import DateTimeWidget from "../DateTimeWidget/DateTimeWidget.jsx"
import Modal from "../Modal/Modal.jsx"
import DescCard from "../DescCard/DescCard.jsx"
import descIcon from '../../assets/icons/carbon_text-long-paragraph.svg'
import './ProjectsCard.css'


function ProjectsCard(props) {
    const [modalActive, setModalActive] = useState(false)
    let clickAction = () => setModalActive(true)

    const { title, buttonTitle, description, linkTo, style, endDateTime, draggable } = props


    return (
        <>
        <div className={style} draggable={draggable}>
            <div className="card-header">
                <div className="card-title">{title}</div>
            </div>
            <div className="card-content">
                <LinkButton style='linkbutton-component to-project-linkbutton' link={linkTo} title={buttonTitle}/>
            </div>
            <div className='card-footer'>
                <Button style='button-component desc-button' icon={descIcon} action={clickAction}/>
                <DateTimeWidget endDateTime={endDateTime}/>
            </div>
        </div>
        <Modal active={modalActive} setActive={setModalActive} children={<DescCard title={title} description={description} />} />
        </>
    )
    
}

export default ProjectsCard