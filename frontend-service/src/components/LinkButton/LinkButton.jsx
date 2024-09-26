import { Link } from 'react-router-dom';
import './LinkButton.css'

function LinkButton(props) {

    const { style, link, title } = props

    return (
        <>
            <Link className={style} to={link}>{title}</Link>
        </>
        
    )
}

export default LinkButton