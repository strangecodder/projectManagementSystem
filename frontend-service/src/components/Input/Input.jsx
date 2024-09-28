import './Input.css'

function Input(props) {

    const { lbTitle, lbDesc, subTitle} = props

    return (
        <>
            <form className="input-form">
                <label for="title">{lbTitle}</label>
                <input type="text" name="title" id="" required></input>
                <label for="description">{lbDesc}</label>
                <textarea type="text" name="description" id=""></textarea>
                <input type="submit" value={subTitle}></input>
            </form>
        </>
    )
    
}

export default Input