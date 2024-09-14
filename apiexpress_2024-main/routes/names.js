const { Router } = require('express');
const { getCountries } = require('../controllers/names'); // Asegúrate de que el controlador esté bien importado
console.log(getCountries);
const router = Router();
router.get('/', getCountries); // Define la ruta para manejar solicitudes GET a /names

module.exports = router;