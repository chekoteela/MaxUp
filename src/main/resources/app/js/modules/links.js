const linkClick = (links) => {

    const allLink = document.querySelectorAll(links);
    const address = links.slice(1);

    allLink.forEach((link) => {

        link.addEventListener('click', ()=>{
            
            window.location.href = `/${address}`;
        })
    })
}

export default linkClick;