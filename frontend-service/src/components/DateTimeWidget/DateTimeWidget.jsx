import clockIcon from '../../assets/icons/carbon_time.svg'
import './DateTimeWidget.css'

function DateTimeWidget(props) {

    const { endDateTime } = props
    
    return (
        <>
            <div className="date-time-widget">
                <img src={clockIcon} alt='' />
                <span>{endDateTime}</span>
            </div>        
        </>
    )
}

export default DateTimeWidget