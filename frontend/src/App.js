import './App.css';
import { useState } from 'react';
import FrontPage from './components/FrontPage';
import RecipePage from './components/RecipePage';

function App() {
  const [currentPage, setCurrentPage] = useState ('frontpage');

  if (currentPage === 'recipe') {
    return <RecipePage />;
  }

  return <FrontPage onEnterApp ={() => setCurrentPage('recipe')} />
}

export default App;
