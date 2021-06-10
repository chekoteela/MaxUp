const front = () =>{

    const a = document.querySelectorAll('a');

    a.forEach((link) => {

        let href = link.href.slice(21);
        let newLink = `.${href}.html`;

        link.addEventListener('click', (e)=>{
            e.preventDefault();
            window.location.href = newLink;
        });
    });
}

export default front;