import React, { useState, useEffect } from 'react';
import axios from 'axios';

function ProfilePage() {
    const [data, setData] = useState({});

    useEffect(() => {
        axios.get('/api/personal-cabinet')
            .then(response => {
                setData(response.data);
            })
            .catch(error => {
                console.error(error);
            });
    }, []);

    return (
        <div>
            <h2>Личный кабинет</h2>
            <ul>
                <li>id: {data.id}</li>
                <li>Имя: {data.firstName}</li>
                <li>Фамилия: {data.lastName}</li>
                <li>Id отдела: {data.departmentId}</li>
                <li>Электронная почта: {data.email}</li>
                <li>Имя гита: {data.gitName}</li>
            </ul>
        </div>
    );
}

export default ProfilePage;
