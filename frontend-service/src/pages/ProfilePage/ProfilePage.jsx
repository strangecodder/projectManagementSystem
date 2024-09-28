import './ProfilePage.css'
import Login from "../../components/Login/Login.jsx"

function ProfilePage() {

    return (
        <>
            <aside className='main-aside'>
            
            </aside>
            <section className='main-section'>
                <div className="projects-page">
                    <div className="projects-header">
                        <div>Личный кабинет</div>
                        <Login />
                    </div>
                    <div className="projects-list">
                    </div>
                </div>
            </section>
        </>
    )
    
}

export default ProfilePage