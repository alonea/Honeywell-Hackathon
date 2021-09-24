import React from 'react';

import Shelf from '../Shelf';
import Filter from '../Shelf/Filter';
import Orders from '../Shelf/Orders';
import FloatCart from '../FloatCart';

const App = () => (
  <React.Fragment>
    <main>
      <div>
      <Filter/>
      <div style={{marginTop:80}}>
      <Orders/>
      </div>
      </div>
      <Shelf/>
    </main>
    <FloatCart />
  </React.Fragment>
);

export default App;
