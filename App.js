import logo from './logo.svg';
import React, {use, useState} from "react";

function App() {
  //////////////////////////////////////////////////////// Code
  //1. 변수 let
  let logo = "My React";
  //2. useState
  //let title = "React Basic";
  let [ title, setTitle ] = useState("React Basic"); // 변수명, 변수변경함수
  //3. onClick={()=> console.log('.....')}
  //4. onClick={changeTitle}
  const changeTitle = () => {console.log('......')
    //4-1. 단순 대입 시 state의 값의 변경점을 reactDOM이 알지 못함.
    //불가능 - title="HD Portfolio";
    //4-2. useState 2번째 매개변수로 전달받은 함수를 통해 재 렌더링이 된다.
    setTitle("HD Portfolio");
  };
  //5. board list
  let [list, setList] = useState( [
    { no : 1,
      name: 'Adeel Solangi',
      title: 'Sindhi',
      content: 'Donec lobortis eleifend condimentum. Cras dictum dolor lacinia lectus vehicula rutrum. Maecenas quis nisi nunc. Nam tristique feugiat est vitae mollis. Maecenas quis nisi nunc.',
      date: '2025.01.01'
    },
    { no : 2,
      name: 'Afzal Ghaffar',
      title: 'Sindhi',
      id: 'ENTOCR13RSCLZ6KU',
      content: 'Aliquam sollicitudin ante ligula, eget malesuada nibh efficitur et. Pellentesque massa sem, scelerisque sit amet odio id, cursus tempor urna. Etiam congue dignissim volutpat. Vestibulum pharetra libero et velit gravida euismod.',
      date: '2025.01.01'
    },
    ] );
    /*
    // -[].map((data, i) => () )
    //          한개씩 뽑아서, 순서대로 적용용
    //6. listDel(li.no)
    const listDel = (no) => {
      //6-1. 삭제할 번호
      //6-2. 전체 리스트
      console.log(no);
      console.log(list);
      //6-3. Array.splice(index(순번)위치, 삭제할 갯수)
      for (let i=0; i<list.length; i++) {
        if(list[i].no == no) {
          //리스트들 안에서 번호가 같다면 해당번호 1개 지우기
            list.splice(i, 1);
          break; //if 문 빠져나오기
        }
      }
      console.log(list); //리스트값 변경확인
      //setList(list); // 값이 제거되어도 렌더링이 이뤄지지 않음. -> 실제값이 아님.
      setList([...list]); // 실제 반영된 전체 값. (... -> 배열의 값 자체가 반영됨.)
    }; */
    //6. listDel(li.no) (2)
    const listDel = (no) => {
      let filterList = list.filter( li => li.no != no ); //게시판 배열에서 글 번호가 일치하지 않는 것 들만 묶는다.
      setList(filterList)
    };
    //7. listWrite
    let [bname, setBname] = useState('');
    let [btitle, setBtitle] = useState('');
    let [bcontent, setBcontent] = useState('');

    const listWrite = () => { 
      //1. 입력값받기 js.ver : document.querySelect('선택자').value /react.ver : useState
      //2. 입력값이 게시글 생성
      let userInput = {
        no : Math.max(...list.map(li => li.no)) +1, // 제일 큰 수를 찾아서 하나 증가시켜라. 어디서? li.no라는 li 리스트에서
        title : btitle ,
        content : bcontent,
        date : new Date().toLocaleDateString()
      }
      //3. 리스트에 넣기
      list.push(userInput)
      //4. 화면에 반영
      setList([...list])
     };


  //////////////////////////////////////////////////////// View
  return (
    <div className="App">
      {/* nav bar */}
      <nav className="navbar navbar-expand-sm navbar-dark bg-dark">
  <div className="container-fluid">
    <a className="navbar-brand" href="#" onClick={ () => console.log('......') }>   {logo}     </a> {/* {}안은 스크립트의 영역 {} -> 기능 {{}} -> 스타일같은 꾸미기 */}
    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
      <span className="navbar-toggler-icon"></span>
    </button>
    <div className="collapse navbar-collapse" id="mynavbar">
      <ul className="navbar-nav me-auto">
        <li className="nav-item">
          <a className="nav-link" href="#">Link</a>
        </li>
        <li className="nav-item">
          <a className="nav-link" href="#">Link</a>
        </li>
        <li className="nav-item">
          <a className="nav-link" href="#">Link</a>
        </li>
      </ul>
    </div>
  </div>
      </nav>
      {/* table */}
      {/* container-row-col 순서 */}
      <div className='container my-5'> 
        <div className='row my-3' >
          <div className='col-sm-12'>
            <h3 style={{fontWeight:"bold"}}  onClick={changeTitle}>{ title }</h3>
            <table className="table table-striped table-bordered table-hover">
              <caption>REACT BOARD</caption>
              <thead>
                <tr>
                  <th scope='col' style={{width:'10%'}}>NO</th>
                  <th scope='col' style={{width:'40%'}}>TITLE</th>
                  <th scope='col' style={{width:'30%'}}>WRITE</th>
                  <th scope='col' style={{width:'10%'}}>DATE</th>
                  <th scope='col' style={{width:'10%'}}>DEL</th>
                </tr>
              </thead>
              <tbody>
                {/* let  user = [
                      {a:"one" , b:"First"} , 
                      {a:"two" , b:"Second"} , ];
                  user.map( (u,i)=>(console.log(i, u.a, u.b)  )) */}
              {
                list.map((li, index)=>(
                <tr key={index}>
                  <td>{li.no}</td>
                  <td>{li.title}</td>
                  <td>{li.content}</td>
                  <td>{li.date}</td>
                  <td>
                    {/* 삭제 버튼을 클릭하면 listDel 호출 -console.log("......") */}
                    <button className='btn btn-primary' onClick={()=>{ listDel(li.no) }} >삭제</button>
                    </td>
                </tr>
                ))
              }
              </tbody>
            </table>
          </div>
        </div>
      </div>
      {/* write */}
      <div className='container'>
        <h3>React Write</h3>
        <div className='row my-3 '>
          <div className='col-sm-3'>
              <label htmlFor="name" className="form-label">name:</label>
          </div>
          <div className='col-sm-9'>
            <input type="text" value={bname} onChange={function(e){ setBname( e.target.value ) }} className="form-control" id="name" placeholder="Enter name" name="name"/>
          </div>
        </div>
        <div className='row my-3 '>
          <div className='col-sm-3'>
              <label htmlFor="title" className="form-label">title:</label>
          </div>
          <div className='col-sm-9'>
            <input type="title" value={btitle} onChange={function(e){ setBtitle( e.target.value ) }} className="form-control" id="title" placeholder="Enter title" name="title"/>
          </div>
        </div>
        <div className='row my-3'>
          <div className='col-sm-3'>
              <label htmlFor="content" className="form-label">content:</label>
          </div>
          <div className='col-sm-9'>
            <textarea className="form-control" id="content" placeholder="Enter content" name="content"
              value={bcontent} onChange={  function(e){ setBcontent( e.target.value ) }}
            ></textarea>
          </div>
          <div className='addButton'>
            <button className='btn btn-success' onClick={listWrite}
            >추가하기</button>
          </div>
        </div>
      </div>
      <div className='container alert alert-success'>
        <p>React</p>
      </div>
    </div>
  );
}

export default App;
