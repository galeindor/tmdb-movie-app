import {ListGroup} from "react-bootstrap";

export default function SearchHistory({history, currentSearch, setCurrentSearch}) {

    const hover = (event) => {
        event.target.setAttribute("style", "background-color: #e9ecef")
    }
    const unhover = (event) => {
        event.target.setAttribute("style", "background-color: white")
    }
    const insertToSearchBar = (event, text) => {
        event.preventDefault();
        event.target.active = true;
        console.log(text);
        setCurrentSearch(text);
    }
    return (
        <ListGroup as="ul">
            {history.map((item, index) => {
                if (item.startsWith(currentSearch) && item !== currentSearch) {
                    return (
                        <ListGroup.Item
                            as="li"
                            key={index}
                            className={"mx-2"}
                            onClick={(e) => insertToSearchBar(e, item)}
                            onMouseEnter={hover}
                            onMouseLeave={unhover}
                        >
                            {item}
                        </ListGroup.Item>
                    )
                }
            })
            }
        </ListGroup>
    );
}