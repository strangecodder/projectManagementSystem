import { Link } from 'react-router-dom';
import './LinkButton.css'

function LinkButton(props) {

    const { style, link, title, icon, iconSize } = props

    return (
        <>
            <Link className={style} to={link}>
                <span>
                    <img src={icon} width={iconSize} height={iconSize} alt=""/>
                    {title}
                </span>
            </Link>
        </>
        
    )
}

export default LinkButton