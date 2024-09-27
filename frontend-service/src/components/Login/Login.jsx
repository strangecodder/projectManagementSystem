import React, {useState} from "react";
import './Login.css';
export const Login = () => {

    const [action, setAction] = useState('')

    const registerLink = () => {
        setAction(' active')
    }

    const loginLink = () => {
        setAction('')
    }

    return (
        <div className={`wrapper${action}`}>
            <div className={'form-box login'}>
                <form action={''}>
                    <h1>
                        Вход
                    </h1>
                    <div className={"input-box"}>
                        <input type={"text"}
                               placeholder={'Логин'} required/>
                    </div>
                    <div className={"input-box"}>
                        <input type={"password"}
                               placeholder={'Пароль'} required/>
                    </div>
                    <div className={'remember-forgot'}>
                        <label><input type={'checkbox'}/>Запомнить меня?</label>
                        <a href={"#"}>Забыл пароль?</a>
                    </div>
                    <button type={"submit"}>Войти</button>

                    <div className={"register-link"}>
                        <p>Нету акканута? <a href={"#"} onClick={registerLink}>Регистрация</a></p>
                    </div>
                </form>
            </div>
            <div className={'form-box register'}>
                <form action={''}>
                    <h1>
                        Регистрация
                    </h1>
                    <div className={"input-box"}>
                        <input type={"text"}
                               placeholder={'Логин'} required/>
                    </div>
                    <div className={"input-box"}>
                        <input type={"text"}
                               placeholder={'Почта'} required/>
                    </div>
                    <div className={"input-box"}>
                        <input type={"password"}
                               placeholder={'Пароль'} required/>
                    </div>
                    <div className={'remember-forgot'}>
                        <label><input type={'checkbox'}/>Я согласен с <a href={"#"}>условиями</a></label>
                    </div>
                    <button type={"submit"}>Зарегестрироваться</button>

                    <div className={"register-link"}>
                        <p>Есть акканут? <a href={"#"} onClick={loginLink}>Войти</a></p>
                    </div>
                </form>
            </div>
        </div>
    )
}