import teamLogo from '/src/assets/img/logo.png'
import './Logo.css'

function Logo() {

    return (
        <>
            <img
            width="52px"
            height="52px"
            src={teamLogo} 
            alt="Логотип команды"
            />
        </>
    )
    
}

export default Logo