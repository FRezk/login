$(() => {
    $("#loginForm").on('submit', event => {
        event.preventDefault()
        alert("WORKS")
        const username = event.target.email.value
        const password = event.target.password.value
        console.log(username, password)
    })
})