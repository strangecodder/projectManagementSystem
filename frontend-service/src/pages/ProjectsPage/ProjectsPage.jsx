import { useEffect, useState } from "react"
import ProjectsCard from "../../components/ProjectsCard/ProjectsCard.jsx"
import Button from "../../components/Button/Button.jsx"
import Modal from "../../components/Modal/Modal.jsx"
import Input from "../../components/Input/Input.jsx"
import addIcon from "../../assets/icons/carbon_add-alt.svg"
import './ProjectsPage.css'

function ProjectsPage() {
    const [modalActive, setModalActive] = useState(false)
    let clickAction = () => setModalActive(true)
    // const [currencies, setCurrencies] = useState([])

    // const fetchCurrencies = () => {
    //     axios.get().then(r => {
    //         const currenciesResponse = r.data
    //         setCurrencies()
    //     })
    // }
    
    // useEffect(() => {
    //     fetchCurrencies()
    // }, [])

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
            <Modal active={modalActive} setActive={setModalActive} children={<Input lbTitle='Название проекта' lbDesc='Описание проекта' subTitle='Создать проект'/>} />
        </section>
        </>
    )
}

export default ProjectsPage