const { Router } = require('express')
const { getEstrenos, getPopulares } = require('../controllers/capital')
const rutas = Router()

rutas.get('/capital', getEstrenos)

module.exports = rutas