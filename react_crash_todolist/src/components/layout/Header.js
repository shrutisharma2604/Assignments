import React from 'react';
import { Link } from 'react-router-dom';
import AuthenticationService from '../pages/AuthenticationService';


function Header() {
    return (
        <header style={headerStyle}>
            <h1>TodoList</h1>
            <Link style={linkStyle} to="/">Home</Link> | <Link style={linkStyle} to="/about">About</Link> | <Link style={linkStyle} to="/login">Login</Link> | <Link style={linkStyle} to="/logout" onClick={AuthenticationService.logout}>Logout</Link>
        </header>
    )
}
const headerStyle = {
    background: '#333',
    color: '#fff',
    textAlign: 'center',
    padding: '10px'
}

const linkStyle = {
    color: '#fff',
    textDecoration: 'none'
}


export default Header;