$(() => {
    $("#loginForm").on('submit', event => {
        event.preventDefault()
        $.ajax({
            url: "https://jsonplaceholder.typicode.com/posts/1",
            type: "GET",
            success: result => {
                console.log("Point to our own webservice to validate!")
            }
        })
        const username = event.target.email.value
        const password = event.target.password.value
        //console.log(username, password)
    })
})