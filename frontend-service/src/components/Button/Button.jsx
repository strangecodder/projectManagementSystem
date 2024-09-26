import calenderIcon from '/src/assets/icons/carbon_calendar.svg'
import './Button.css'

function Button(props) {

    const { style, title } = props

    return (
        <>
            <button className={style}>{title}</button>
        </>
        
    )
}

export default Button