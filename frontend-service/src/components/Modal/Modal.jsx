import React from "react";
import './Modal.css'

function Modal(props) {

    const { active, setActive, children } = props

    return (
        <div className={active ? 'modal active' : 'modal'} onClick={() => setActive(false)}>
            <div className={active ? 'modal__content active' : 'modal__content'} onClick={e => e.stopPropagation()}>
                {children}
            </div>
        </div>
    )
}

export default Modal

/*
В основной части, для интеграции данного окна требуется установить состояния активности окна:
const [modalActive, setModalActive] = useState(false)

<button .. onClick={() => setModalActive()} >...</button>

<Modal active ={modalActive} setActive={setModalActive}>
 Тут могут быть ваши теги
</Modal>
 */