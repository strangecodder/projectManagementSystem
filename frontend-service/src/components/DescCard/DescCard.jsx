import './DescCard.css'

function DescCard(props) {

    const { title, description } = props

    return (
        <>
            <div className="description-card">
                <span className="card-project-title">{title}</span>
                <span className="description-card-content">{description}</span>
            </div>
        </>
    )
}

export default DescCard