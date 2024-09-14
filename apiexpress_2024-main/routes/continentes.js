const { Router } = require('express')
const {getContinentes} = require('../controllers/continentes')
const rutas = Router()

rutas.get('/continent', getContinentes)

module.exports = rutas