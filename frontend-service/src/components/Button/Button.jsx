import calenderIcon from '/src/assets/icons/carbon_calendar.svg'
import './Button.css'

function Button(props) {

    const { style, title, icon, action } = props

    return (
        <>
            <button className={style} onClick={action}>
                <span>
                    <img src={icon} alt=""/>
                    {title}
                </span>
            </button>
        </>
        
    )
}

export default Button